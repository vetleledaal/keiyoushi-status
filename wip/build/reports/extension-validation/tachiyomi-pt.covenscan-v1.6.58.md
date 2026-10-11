# Extension Validation Report

- Extension: tachiyomi-pt.covenscan-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Rebirth as the Villainous Duke (`.../rebirth-as-the-villainous-duke`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Rebirth as the Villainous Duke (`.../rebirth-as-the-villainous-duke`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 14 | Romance Not Romantic (`.../romance-not-romantic`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 14 | Winter Time (`.../winter-time`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 14 | 16647 (`.../16647`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Rebirth as the Villainous Duke (`.../rebirth-as-the-villainous-duke`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Rebirth as the Villainous Duke (`.../rebirth-as-the-villainous-duke`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rebirth as the Villainous Duke, URL=`.../rebirth-as-the-villainous-duke` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://covendasbruxonas.com/.../ENG-COVER-1-110x150.png` (image/png, 41356 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rebirth-as-the-villainous-duke` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://covendasbruxonas.com/.../ENG-COVER-1-scaled.png` (image/png, 6419661 bytes, 1810x2560) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | X XBlanc |  |  |  |
| details genres | PASS | Hospedagem, Mature, Psicológico, Smut, Violência, Dark Projects |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Eu estava correndo de moto e, de repente, acordei renascido como um duque vilão! Já que todos neste mundo o veem como maligno, ele poderia muito bem quebrar todas as regras existentes para encontrar o caminho de volta para casa. Mas espere… não estava no romance que o crime proibido supremo era o uso de magia negra? Então, vamos usá-la mesmo assim!! A invocação de demônios mudaria para sempre o destino de “Dezzo”.<br><br>Nomes alternativos: เกิดใหม่เป็นดยุคผู้ชั่วร้าย |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | LINT | All 19 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=19 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://covendasbruxonas.com/.../00.jpg` (image/jpeg, 265430 bytes, 720x377) |  |  |  |
