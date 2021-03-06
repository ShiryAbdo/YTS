package net.mEmoZz.yts.kotlin.ui.base

/**
 * Authored by Mohamed Fathy on 08 Mar, 2018.
 * Contact: muhamed.gendy@gmail.com
 */

interface BaseView<in T : BasePresenter<*, *>> {

  fun setPresenter(presenter: T)

  fun setActionBar()

  fun showProgressBar()

  fun hideProgressBar()
}
