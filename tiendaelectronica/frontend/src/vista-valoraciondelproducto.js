import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

class VistaValoraciondelproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="align-items: stretch;">
 <vaadin-horizontal-layout theme="spacing">
  <h3 id="nombreUsuarioValoracionLabel1">Heading 3</h3>
  <label id="valoracionProductoLabel" style="align-self: center;">valoracionProducto</label>
 </vaadin-horizontal-layout>
 <vaadin-text-area id="comentarioValoracionTArea" style="flex-grow: 0; height: 20%;" readonly></vaadin-text-area>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-valoraciondelproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValoraciondelproducto.is, VistaValoraciondelproducto);
