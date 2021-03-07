import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaVerlistadodecompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button>
   Inicio
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; flex-direction: row; margin: var(--lumo-space-l); flex-shrink: 1;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1;">
    <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 0; align-self: stretch; width: 100%; height: 100%;">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: center;">
     <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1;">
      <iron-icon icon="lumo:plus"></iron-icon>
     </vaadin-button>
     <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1;">
      <iron-icon icon="lumo:plus"></iron-icon>
     </vaadin-button>
     <vaadin-button theme="icon" aria-label="Add new" style="flex-grow: 1;">
      <iron-icon icon="lumo:plus"></iron-icon>
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-tab></vaadin-tab>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch;">
    <vaadin-text-field label="Label" placeholder="Placeholder" style="flex-grow: 0;"></vaadin-text-field>
    <vaadin-text-field label="Label" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-text-field label="Label" placeholder="Placeholder"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: space-between;">
     <h2 style="flex-shrink: 0; flex-grow: 1;">Oferta</h2>
     <vaadin-combo-box style="align-self: center; flex-grow: 1;"></vaadin-combo-box>
    </vaadin-horizontal-layout>
    <vaadin-button theme="primary" style="align-self: flex-end;">
     Guardar cambios
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verlistadodecompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerlistadodecompras.is, VistaVerlistadodecompras);
