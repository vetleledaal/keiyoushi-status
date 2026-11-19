# Extension Validation Report

- Extension: tachiyomi-pt.covenscan-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5558728935088189480
- Source name: Coven Scan
- Source language: pt-BR
- Selected manga input: latest offset 0: Bolo de Cereja (`.../bolo-de-cereja`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Rebirth as the Villainous Duke (`.../rebirth-as-the-villainous-duke`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 14 | Form of Shympathy (`.../form-of-shympathy`) |  | 10s+ |
| latest | `getLatestUpdates(1)` | success | 14 | Bolo de Cereja (`.../bolo-de-cereja`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 14 | In the Shadow of the Serpent (`.../moonlight-projection`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bolo de Cereja (`.../bolo-de-cereja`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bolo de Cereja (`.../bolo-de-cereja`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 10s+ |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bolo de Cereja, URL=`.../bolo-de-cereja` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://covendasbruxonas.com/.../tall-5-5-350x476.webp` (image/webp (encoding: lossy), 29020 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bolo-de-cereja` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://covendasbruxonas.com/.../tall-5-5.webp` (image/webp (encoding: lossy), 55664 bytes, 420x560) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Nocha |  |  |  |
| details genres | PASS | BL, Drama, Omegaverse, Romance, Yaoi, Hospedagem, Pena Traduções |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A vida tranquila de Soohyeon no campo, administrando uma pequena mercearia e cuidando de um jardim, vira de cabeça para baixo quando começam a circular rumores sobre a construção de um hotel de luxo — e com a chegada de Taeyeon, um diretor mal-humorado, mas curiosamente encantador, da S.W. Construction, que mais parece um chefe da máfia do que um homem de negócios. Apesar dos avisos das vovós da vila para manter distância, Soohyeon não se intimida, mesmo quando Taeyeon tenta “suborná-lo” com doces, o que começa a derreter suas defesas. Mas quando um momento inesperado revela o maior segredo de Soohyeon, o que começou como um choque de personalidades se transforma em uma mistura caótica de doçura, tensão e surpresas que nenhum dos dois esperava.<br><br>Nomes alternativos: Cherry Cake, 체리 케이크 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | LINT | All 61 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=61 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://covendasbruxonas.com/.../0.jpg` (image/jpeg, 91014 bytes, 1242x698) |  |  |  |
