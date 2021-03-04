import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-correogeneral`
 *
 * VistaCorreogeneral element.
 *
 * @customElement
 * @polymer
 */
class VistaCorreogeneral extends PolymerElement {

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
        return 'vista-correogeneral';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCorreogeneral.is, VistaCorreogeneral);
