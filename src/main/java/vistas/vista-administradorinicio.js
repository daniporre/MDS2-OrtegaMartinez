import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administradorinicio`
 *
 * VistaAdministradorinicio element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministradorinicio extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-administradorinicio';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministradorinicio.is, VistaAdministradorinicio);
