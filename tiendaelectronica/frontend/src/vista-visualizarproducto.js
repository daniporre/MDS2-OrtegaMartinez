import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaVisualizarproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
  <vaadin-text-field label="" placeholder="Buscar en la tienda" style="flex-grow: 1; flex-shrink: 1;" id="searchBar"></vaadin-text-field>
  <vaadin-button id="buscarButton">
    Buscar 
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;" id="vaadinTab"></vaadin-tab>
  <vaadin-button id="verCarritoButton">
   Carrito
  </vaadin-button>
  <vaadin-button id="iniciarSesionButton">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button id="imagen1Button" style="align-self: stretch; flex-grow: 1;">
      Button 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <h2 id="nombreProductoTitulo">nombreProducto</h2>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
     <label id="precioProductoLabel">precioProducto</label>
     <label id="decuentoProductoLabel">descuentoProducto</label>
    </vaadin-horizontal-layout>
    <label id="valoracionProductoLabel">valoracionProducto</label>
    <label>Referencia:</label>
    <label id="referenciaProductoLabel">referenciaProducto</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-button id="imagen2Button">
     Button 
   </vaadin-button>
   <vaadin-button id="imagen3Button">
     Button 
   </vaadin-button>
   <vaadin-button id="imagen4Button">
     Button 
   </vaadin-button>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <vaadin-button theme="primary" id="aniadirAlCarritoButton" style="flex-grow: 0;">
     Añadir al carrito 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <h3>Descripción del producto:</h3>
  <vaadin-text-area id="descripcionProductoTArea" style="align-self: stretch; flex-grow: 0; height: 20%;" readonly></vaadin-text-area>
  <h3>Valoraciones del producto:</h3>
  <vaadin-vertical-layout theme="spacing" id="valoracionesProductoVLayout" style="align-self: stretch; flex-grow: 1; align-items: stretch;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-visualizarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVisualizarproducto.is, VistaVisualizarproducto);
