package com.yydcdut.note.mvp.v.home;

import com.yydcdut.note.bean.Category;
import com.yydcdut.note.mvp.IView;

import java.util.List;

/**
 * Created by yuyidong on 15/11/19.
 */
public interface IHomeView extends IView {
    /**
     * drawer是不是打开的
     *
     * @return
     */
    boolean isDrawerOpen();

    /**
     * Open drawer
     */
    void openDrawer();

    /**
     * Close drawer
     */
    void closeDrawer();

    /**
     * footer的云，同步时候的动画
     */
    void cloudSyncAnimation();

    void updateQQInfo(boolean isLogin, String name, String imagePath);

    void updateEvernoteInfo(boolean isLogin);

    void setCategoryList(List<Category> list);

    void updateCategoryList(List<Category> list);

    void notifyCategoryDataChanged();

    void changeFragment(String categoryLabel);

    void changePhotos4Category(String categoryLabel);

    void jump2LoginActivity();

    void jump2UserCenterActivity();

}
