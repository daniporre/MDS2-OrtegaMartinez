import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

class VistaResultadodebusqueda extends PolymerElement {

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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button>
    Inicio 
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="flex-grow: 1;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button>
    Carrito 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
  <vaadin-button>
    Iniciar sesion 
  </vaadin-button>
  <vaadin-button>
    Mi cuenta 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
  <vaadin-vertical-layout style="width: 20%; margin: var(--lumo-space-xl);">
   <h3>Rango de precio</h3>
   <vaadin-radio-group value="foo" theme="vertical">
    <vaadin-radio-button name="foo">
      Hasta 20€ 
    </vaadin-radio-button>
    <vaadin-radio-button name="bar" checked>
      Hasta 50€ 
    </vaadin-radio-button>
    <vaadin-radio-button name="baz" checked>
      Hasta 100€ 
    </vaadin-radio-button>
    <vaadin-radio-button name="foo">
      Más de 100€ 
    </vaadin-radio-button>
   </vaadin-radio-group>
   <h3>Marca</h3>
   <vaadin-checkbox>
     marca1 
   </vaadin-checkbox>
   <vaadin-checkbox>
     marca2 
   </vaadin-checkbox>
   <vaadin-checkbox>
     marca3 
   </vaadin-checkbox>
   <vaadin-checkbox>
     marca4 
   </vaadin-checkbox>
   <vaadin-checkbox>
     marca5 
   </vaadin-checkbox>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-grow: 1; margin: var(--lumo-space-xl);">
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
    <h3>Resultado de la búsqueda</h3>
    <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
    <vaadin-combo-box style="align-self: center;"></vaadin-combo-box>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: stretch;">
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
     <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;"></vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;"></vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: stretch;"></vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-resultadodebusqueda';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaResultadodebusqueda.is, VistaResultadodebusqueda);
