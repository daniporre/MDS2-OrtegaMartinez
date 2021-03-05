import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';

class VistaCorreogeneral extends PolymerElement {

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
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-tabs orientation="horizontal" selected="0">
   <vaadin-tab selected>
    Enviados
   </vaadin-tab>
   <vaadin-tab>
    Recibidos
   </vaadin-tab>
  </vaadin-tabs>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <label>Estado</label>
   <vaadin-tab style="flex-grow: 0;"></vaadin-tab>
   <label>Cuerpo del mensaje</label>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <label>Asunto</label>
   <vaadin-tab style="flex-grow: 1; flex-shrink: 0;"></vaadin-tab>
   <label>Fecha</label>
   <vaadin-tab style="flex-grow: 0;"></vaadin-tab>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch;"></vaadin-vertical-layout>
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
