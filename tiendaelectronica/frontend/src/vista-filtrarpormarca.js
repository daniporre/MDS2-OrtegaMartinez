import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';

class VistaFiltrarpormarca extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="checkBoxVerticalLayout">
 <vaadin-radio-group id="radioGroup" style="width: 100%; align-self: stretch;"></vaadin-radio-group>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-filtrarpormarca';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaFiltrarpormarca.is, VistaFiltrarpormarca);
