package br.com.apkdoandroid.mymenus

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class TabNavITem (
    val type : TabNavType,
    val badge : Int,
    @StringRes val title : Int,
    @DrawableRes val selectedIcon : Int,
    @DrawableRes val unSelectedIcon : Int
){

    object Home : TabNavITem(
        type = TabNavType.HOME,
        badge = 0,
        title = R.string.label_home_navigation_drawer_item,
        selectedIcon = R.drawable.ic_home_fill,
        unSelectedIcon = R.drawable.ic_home_line
    )

    object Search : TabNavITem(
        type = TabNavType.SEARCH,
        badge = 0,
        title = R.string.label_search_navigation_drawer_item,
        selectedIcon = R.drawable.ic_search_fill,
        unSelectedIcon = R.drawable.ic_search_line
    )

    object Notification : TabNavITem(
        type = TabNavType.NOTIFICATION,
        badge = 10,
        title = R.string.label_notifications_navigation_drawer_item,
        selectedIcon = R.drawable.ic_notification_fill,
        unSelectedIcon = R.drawable.ic_notification_line
    )

    object Order : TabNavITem(
        type = TabNavType.ORDER,
        badge = 0,
        title = R.string.label_orders_navigation_drawer_item,
        selectedIcon = R.drawable.ic_shopping_fill,
        unSelectedIcon = R.drawable.ic_shopping_line
    )

    object Favorite : TabNavITem(
        type = TabNavType.FAVORITE,
        badge = 0,
        title = R.string.label_favorite_navigation_drawer_item,
        selectedIcon = R.drawable.ic_favorite_fill,
        unSelectedIcon = R.drawable.ic_favorite_line
    )


    enum class TabNavType {
        HOME,
        SEARCH,
        NOTIFICATION,
        ORDER,
        FAVORITE
    }

    companion object{
        val items = listOf(
            Home,
            Search,
            Notification,
            Order,
            Favorite
        )
    }
}