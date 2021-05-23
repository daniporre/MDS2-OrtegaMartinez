import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaCorreogeneral extends PolymerElement {

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
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-tabs orientation="horizontal" selected="0">
    <vaadin-tab selected id="pestañaEnviados">
      Enviados 
    </vaadin-tab>
    <vaadin-tab id="pestañaRecibidos">
      Recibidos 
    </vaadin-tab>
   </vaadin-tabs>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <vaadin-button theme="icon" aria-label="Add new" id="nuevoCorreoButton" style="flex-grow: 0;">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-tab></vaadin-tab>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <h3 style="flex-grow: 0;">Estado</h3>
   <vaadin-tab style="flex-grow: 0;"></vaadin-tab>
   <h3>Mensaje</h3>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <h3>Asunto</h3>
   <vaadin-tab style="flex-grow: 1; flex-shrink: 0;"></vaadin-tab>
   <h3>Fecha</h3>
   <vaadin-tab style="flex-grow: 0;"></vaadin-tab>
   <vaadin-tab></vaadin-tab>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;" id="tablaMensajesVLayout"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-correogeneral';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCorreogeneral.is, VistaCorreogeneral);
