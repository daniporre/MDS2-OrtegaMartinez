import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaVeroferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%; flex-direction: column;">
 <img style="width: 100%; height: 100%; align-self: center;" id="imagenProductoOferta">
 <label id="precioOferta">Label</label>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-veroferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVeroferta.is, VistaVeroferta);
