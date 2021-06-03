import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVerproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-self: stretch; justify-content: center;" id="vaadinHorizontalLayout">
 <img id="imagenProducto" style="width: 15%; height: 20%; flex-grow: 1; align-self: flex-start;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 20%; flex-grow: 1;">
  <h2 id="nombreProducto">Nombreproducto </h2>
  <label id="descripcionProducto">Label</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; height: 20%; width: 100%; align-items: flex-end;">
  <img id="valoracionProducto" style="width: 30%; height: 20%; align-self: stretch;">
  <label id="precioProducto" style="margin: var(--lumo-space-m);">Label</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-verproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerproducto.is, VistaVerproducto);
