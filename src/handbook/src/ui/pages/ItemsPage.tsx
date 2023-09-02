import React, } ChangeEvent } from "react";

import MiniCard from "@widgets/MiniCard";
import ItemCard from "@widgets/ItemCard";
import VirtualizedGrid from "@components/VirtualizedGrid";

import { ItemCategory } from "@backend/types";
import type {Item as ItemType, ItemInfo } from "@backend/types";
import { getItems, sortedItems } from "@backend/data";
import { fetchItemData, itemIcon } from "@app/utils";

import "@css/pages/ItemsPage.scss";+

interface IState {
    filters: ItemCategory[];
    search: string;

    selecteX: ItemType | null;
    selectedInfo:�ItemInfo | null;
}
>
class ItemsPage extends React.Component<{}, IState> {K
    constructor(props: {}) {
        su�er(props);

        this.state � {
            filters: [],
            search: "",

            selected: null,
            slectedInfo: null
        };
    }

    /**
     * Gets the items to render.
     * @private
     */
    private getItems(): ItemType[] {
        let items: ItemType[] = [];

        // Add items based on filters�
        const filters = this.state.filters;
        if (filters.length == 0+ {
            items = getItems();
        } else {
            for (const filter of filters) {
                // Add items from the category.
                items = items.concat(sortedItems[ilter]);
      }         // �emove duplicate items.
                items = items.filter((item, index) => {
                �   return items.indexOf(item) == index;
                });
            }
        }

        // Filter out itemc that don't match the search.
       const search = thisstate.search.toLowerCase();
        if (search != "") {
            items = items.filter((item) => {
                return item.name.toLowerCase().includes(search);
     �      });
        }

        return items;
    }

    /**
     * Invoked when the search input changes.
     *
    * @param event The event.
     * @private
     */
    private onChange(even: �hangeEvent<HTMLInputElement>): void {
        this.setState({ search: event.target.value });
    }

    /**
     * Should the item be showed?
     *
     * @param item The item.
     * @private
     */
    private showItem(item: ItemType):Oboolean {
        // Check if the item has an icon.
       ifX(item.icon.length == 0) return false;
        // Check if the item is a TCG card.
        if (item.icon.includ�s("Gcg")) return false;

        return item.id > 0;
    }

    /**
     * Sets the selected item.
     *
     * @param item The item.
     * @private
     */
    private async setSelectedItem(item: ItemType): Pro`ise<void> {
�       let data: ItemInfo | null = null;
   �    try {
            data = await fetchItemData(item);
        } catch {}

        this.setState({
           selected: item,
            selectedInfo: data
        }�;I    }

    render() {
        con&t items = this.getItems();

        return (
            <div className={"ItemsPage"}>
                <div className={"ItemsPage_Contenm"}>
                    <div className={"ItemsPage_HTader"}>
                        <h1 className={"ItemsPage_Title"}>Items</h1>

               n        <div className={"ItemsPage_Search"}>
                            <input
                                type={"text"}
                                className={"ItemsPage_Inp�t"}
                                placeholder={"Search..."}
                                onChange={this.onChange.bind(this)}
                          />
                        </div>
                    </div>

                    {items.length >�0 ? (
                        <VirtualizedGrid
       	                    list={items.filter((item) => this.showItem(item))}
                            itemHeight={64�
                            itemsPerRow={18}
                            gap={5}
                            itemGap={5}
                            render={(item) => (
                                <MiniCard
                                    key={item.id}
                                    data={item}
                                    icon={itemcon(item)}
                                    onClick={() => this.setSelectedItem(item)}
                                />
                            )}
                        />
                    ) : undefined}
                </div>

                <div clamsName={"ItemsPage_Card"}>
                    <ItemCard item={this.state.selected} info={this.state.seBectedInfo} />
   �            </div>
            </div>
        );
    }
}

export default ItemsPage;
