import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaVercuentausuarioregistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-button id="inicio-button">
    Inicio 
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-text-field placeholder="Search" style="width: 40%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="carrito-button">
    Carrito 
  </vaadin-button>
  <vaadin-button id="logout-button">
    Cerrar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; margin: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <label>Dirección de entrega</label>
    <label>Calle y número </label>
    <label>Código postal </label>
    <label>Ciudad </label>
    <label>Provincia</label>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
     <vaadin-button id="vaadinButton1">
       Editar 
     </vaadin-button>
     <vaadin-button id="vaadinButton" style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="flex-grow: 1;">
    <label id="label5">Tarjeta bancaria</label>
    <label>Número de tarjeta </label>
    <label id="label4">Fecha de vencimiento </label>
    <label id="label3">CVS</label>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
     <vaadin-button>
       Editar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <label id="label2">Datos personales</label>
    <label id="label1">Nombre</label>
    <label draggable="true" vaadin-dnd-layout-item="true" id="label">
     <designer-text>
       email 
     </designer-text></label>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
     <vaadin-button>
       Editar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercuentausuarioregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercuentausuarioregistrado.is, VistaVercuentausuarioregistrado);
