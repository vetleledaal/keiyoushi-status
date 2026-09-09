# Extension Validation Report

- Extension: tachiyomi-es.mantrazscan-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 4
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7172992930543738693
- Source name: Mantraz Scan
- Source language: es
- Selected manga input: popular offset 0: El hijo menor del clan de asesinos regresa con los poderes de cinco reyes demonio (`.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | El hijo menor del clan de asesinos regresa con los poderes de cinco reyes demonio (`.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Me caso con el hijo ilegítimo de la familia enemiga — L (`.../me-caso-con-el-hijo-ilegitimo-de-la-familia-enemiga-l`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | El hijo menor del clan de asesinos regresa con los poderes de cinco reyes demonio (`.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Me caso con el hijo ilegítimo de la familia enemiga — L (`.../me-caso-con-el-hijo-ilegitimo-de-la-familia-enemiga-l`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El hijo menor del clan de asesinos regresa con los poderes de cinco reyes demonio (`.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El hijo menor del clan de asesinos regresa con los poderes de cinco reyes demonio (`.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El hijo menor del clan de asesinos regresa con los poderes de cinco reyes demonio, URL=`.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.mantrazscan.co/.../DM_20260908173958_001.jpg` (image/jpeg, 314788 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-hijo-menor-del-clan-de-asesinos-regresa-con-los-poderes-de-cinco-reyes-demonio` |  |  |  |
| details thumbnail URL | PASS | `https://img.mantrazscan.co/.../DM_20260908173958_001.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ¡Ganadora del Gran Premio en la 2.ª edición de los Piccoma Novel Awards, ahora adaptada a SMARTOON! La familia Valgred es un temido clan de asesinos conocido en todo el campo de batalla como los heraldos de la muerte. Glenn, el hijo menor de la familia, nació frágil y enfermizo, incapaz incluso de soportar un entrenamiento adecuado. Tachado de fracaso, su propio padre lo repudia cruelmente y lo abandona a su suerte en un páramo helado. Al borde de la muerte, Glenn es rescatado por el emperador Wilfoen Thorngrave. Decidido a pagar esa bondad, lo entrega todo para servir al emperador. Con el tiempo, derrota a los Cinco Grandes Reyes Demonio y se convierte en el héroe que guía a la humanidad hacia la victoria en la guerra contra los demonios. Pero al final de todo, el emperador en quien confiaba lo traiciona. Glenn es brutalmente asesinado por nueve misteriosos asesinos... solo para despertar treinta años en el pasado. Armado con las habilidades y conocimientos supremos adquiridos en su primera vida, así como con los poderes de los Cinco Grandes Reyes Demonio que ahora habitan en su interior, Glenn comienza a despertar a una velocidad sin precedentes. Esta vez, su destino será diferente. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.mantrazscan.co/.../tira_unida_01.webp` (image/webp (container: extended), 493236 bytes, 800x8000) |  |  |  |
