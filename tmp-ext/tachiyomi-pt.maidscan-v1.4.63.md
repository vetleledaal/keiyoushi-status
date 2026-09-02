# Extension Validation Report

- Extension: tachiyomi-pt.maidscan-v1.4.63
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7624757094973334315
- Source name: Maid Scan
- Source language: pt-BR
- Selected manga input: latest offset 0: Lágrimas sobre Flores Murchas (`.../5113`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Uma Princesa que Lê a Sorte (`.../10714`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 26 | A Tradutora do Tirano (`.../10721`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Lágrimas sobre Flores Murchas (`.../5113`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | A Noiva do Grão-Duque é uma Guerreira Infernal (`.../14305`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Lágrimas sobre Flores Murchas (`.../5113`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lágrimas sobre Flores Murchas (`.../5113`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 118 | Capítulo 1 (`.../71400`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lágrimas sobre Flores Murchas, URL=`.../5113` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.verdinha.wtf/.../67885f40ec728.png <redacted query values: width>` (image/jpeg, 37316 bytes, 300x429) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../5113` |  |  |  |
| details thumbnail URL | PASS | `https://api.verdinha.wtf/.../67885f40ec728.png <redacted query values: width>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shoujo / Romances, Drama, Romance, Adulto |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A vida de Na Hae-soo se desfaz quando seu marido a trai com um caso, deixando-a sobrecarregada com dívidas e perdendo seu filho. Em um golpe devastador, ela o testemunha com uma mulher mais jovem. Quebrada e desanimada, Na Hae-soo sente sua vida desmoronando ao seu redor. No entanto, um jovem misterioso entra inesperadamente em sua vida, pedindo para aprender sobre o amor adulto. Sua vulnerabilidade e sinceridade começam a agitar emoções dentro de Na Hae-soo, desafiando-a a reconsiderar seu caminho a seguir. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | PASS | 118 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.verdinha.wtf/.../01.jpg` (image/jpeg, 475700 bytes, 720x7085) |  |  |  |
