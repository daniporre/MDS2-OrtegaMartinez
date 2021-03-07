import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaAdministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
  <vaadin-button id="inicioButton">
   Inicio
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1; flex-shrink: 0;"></vaadin-tab>
  <vaadin-button id="aniadirProductoButton">
    Añadir producto 
  </vaadin-button>
  <vaadin-button id="gestionarProductoButton">
    Gestionar productos 
  </vaadin-button>
  <vaadin-button id="verListadoComprasButton">
    Ver listado de compras 
  </vaadin-button>
  <vaadin-button id="salirButton">
    Cerrar sesión 
  </vaadin-button>
  <vaadin-button style="flex-grow: 0; flex-shrink: 0;" id="correoButton">
    Correo 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-vertical-layout class="sidebar" style="flex-basis: calc(7*var(--lumo-size-s)); flex-shrink: 0; background-color: var(--lumo-contrast-5pct);">
   <vaadin-text-field label="Nombre oferta" style="align-self: center; flex-grow: 0; flex-shrink: 0;" id="nombreOfertaTF"></vaadin-text-field>
   <vaadin-text-field label="Descuento" style="align-self: center;" id="descuentoTF"></vaadin-text-field>
   <vaadin-button style="align-self: stretch;" id="crearOfertaButton">
     Crear nueva oferta 
   </vaadin-button>
   <label style="align-self: flex-start;">Dar de baja oferta </label>
   <vaadin-combo-box style="align-self: center;" id="darDeBajaComboBox"></vaadin-combo-box>
   <vaadin-button style="align-self: stretch;" id="darBajaButton">
     Dar de baja 
   </vaadin-button>
   <vaadin-text-field label="Nombre categoria " style="align-self: center;" id="nuevaCategoriaTF"></vaadin-text-field>
   <vaadin-button style="align-self: stretch;" id="nuevaCategoriaButton">
     Crear nueva categoría 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto;" id="principalVLayout"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrador.is, VistaAdministrador);
