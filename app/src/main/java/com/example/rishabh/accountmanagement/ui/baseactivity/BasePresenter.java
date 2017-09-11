package com.example.rishabh.accountmanagement.ui.baseactivity;

/**
 * Created by Rishabh on 10/09/17.
 */

public class BasePresenter implements MVPPresenter {

    MVPView view;

    @Override
    public void attachView(MVPView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    public MVPView getView() {
        return view;

    }

    public boolean isViewAttached() {
        return view != null;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) {
            throw new MVPViewNotAttachedException();
        }
    }

    public static class MVPViewNotAttachedException extends RuntimeException {

        public MVPViewNotAttachedException() {
            super("Please attach a view first");
        }

    }
}
