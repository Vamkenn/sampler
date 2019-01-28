package com.haulmont.sampler.web.ui.containers.htmlbox.template;

import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HtmlBoxLayout;
import com.haulmont.cuba.gui.screen.ScreenFragment;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;

@UiController("html-box-template")
@UiDescriptor("html-box-template.xml")
public class HtmlBoxTemplateSample extends ScreenFragment {

    @Inject
    private HtmlBoxLayout htmlSample;
    @Inject
    private Notifications notifications;

    @Subscribe
    protected void onInit(InitEvent event) {
        htmlSample.setTemplateContents(
                "<div class=\"box-container\">" +
                "    <img src=\"../images/platform-logo.png\" class=\"logo\">" +
                "    <div class=\"button-container\">" +
                "        <div class=\"sample-button addons-button\" location=\"addons\"></div>" +
                "        <div class=\"sample-button buy-button\" location=\"buy\"></div>" +
                "        <div class=\"sample-button support-button\" location=\"support\"></div>" +
                "    </div>" +
                "</div>");
    }

    @Subscribe("okbutton")
    protected void onOkbuttonClick(Button.ClickEvent event) {
        click();
    }

    @Subscribe("addons")
    protected void onAddonsClick(Button.ClickEvent event) {
        click();
    }

    @Subscribe("buy")
    protected void onBuyClick(Button.ClickEvent event) {
        click();
    }

    @Subscribe("support")
    protected void onSupportClick(Button.ClickEvent event) {
        click();
    }

    public void click() {
        notifications.create()
                .withCaption("Button clicked")
                .show();
    }
}
