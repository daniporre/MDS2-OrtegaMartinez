import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaProductosbuscados extends PolymerElement {

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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
  <vaadin-text-field placeholder="Busca productos" style="flex-grow: 1;" id="buscarTF">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button id="buscarButton">
   Buscar
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="carritoButton">
    Carrito 
  </vaadin-button>
  <vaadin-button id="miCuentaButton">
    Mi cuenta 
  </vaadin-button>
  <vaadin-button id="iniciarSesionButton">
    Iniciar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: stretch;">
  <vaadin-tab></vaadin-tab>
  <vaadin-vertical-layout style="width: 20%; align-items: flex-start; padding: var(--lumo-space-xl);">
   <vaadin-tab></vaadin-tab>
   <h2>Rango de precio</h2>
   <vaadin-radio-group value="foo" theme="vertical" style="width: 100%; align-self: stretch;" id="radioGroup">
    <vaadin-radio-button name="foo" id="hasta20RadioButton" style="flex-grow: 1;" checked>
      Hasta 20€ 
    </vaadin-radio-button>
    <vaadin-radio-button name="bar" checked id="hasta50RadioButton">
      Hasta 50€ 
    </vaadin-radio-button>
    <vaadin-radio-button name="baz" id="hasta100RadioButton" checked>
      Hasta 100€ 
    </vaadin-radio-button>
    <vaadin-radio-button id="masde100RadioButton">
      Más 100€ 
    </vaadin-radio-button>
   </vaadin-radio-group>
   <h2>Marca</h2>
   <vaadin-vertical-layout theme="spacing" id="marcaVerticalLayout" style="align-self: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; padding: var(--lumo-space-l);">
   <vaadin-tab></vaadin-tab>
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
    <h2>Resultados de la búsqueda</h2>
    <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
    <h4 style="align-self: center;">Ordenar por:</h4>
    <vaadin-combo-box id="ordenarComboBox" style="align-self: center;"></vaadin-combo-box>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="productosVerticalLayout" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productosbuscados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosbuscados.is, VistaProductosbuscados);
