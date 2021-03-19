import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaVerproductoencarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; flex-direction: row;">
 <img style="width: 5%; height: 5%; align-self: center;">
 <vaadin-tab></vaadin-tab>
 <label id="nombreProductoLabel" style="align-self: center;">nombreProducto</label>
 <vaadin-tab style="flex-grow: 0; width: 26%;"></vaadin-tab>
 <vaadin-button theme="icon" aria-label="Add new" id="decrementarButton" style="align-self: center;">
  <iron-icon icon="lumo:plus"></iron-icon>
 </vaadin-button>
 <label id="cantidadProductosLabel" style="align-self: center;">cantidad</label>
 <vaadin-button theme="icon" aria-label="Add new" id="aumentarButton" style="align-self: center;">
  <iron-icon icon="lumo:plus"></iron-icon>
 </vaadin-button>
 <vaadin-tab></vaadin-tab>
 <vaadin-tab></vaadin-tab>
 <label id="precioLabel" style="align-self: center;">precio</label>
 <vaadin-tab></vaadin-tab>
 <vaadin-tab></vaadin-tab>
 <label id="totalLabel" style="align-self: center;">Label</label>
 <vaadin-tab></vaadin-tab>
 <vaadin-button id="eliminarProductoButton" style="align-self: center;">
   Eliminar producto 
 </vaadin-button>
 <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-verproductoencarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerproductoencarrito.is, VistaVerproductoencarrito);
