import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaVercatalogo extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-1pct); align-self: center; justify-content: center;" theme="spacing" id="categoriasHLayout"></vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto; margin: var(--lumo-space-m); align-self: stretch;">
  <h3>Ofertas disponibles</h3>
  <vaadin-horizontal-layout theme="spacing" id="ofertasHLayout" style="align-self: stretch;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <h5>Ordenar por:</h5>
   <vaadin-combo-box id="ordenarPorCombobox" style="align-self: center;"></vaadin-combo-box>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <h3 id="categoriaLabel">Categoria</h3>
   <vaadin-combo-box id="filtrarPorCombobox" style="align-self: center;"></vaadin-combo-box>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="productosEnCatalogoVLayout" style="flex-grow: 1; align-self: stretch;background-color: var(--lumo-contrast-1pct);"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercatalogo';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercatalogo.is, VistaVercatalogo);
