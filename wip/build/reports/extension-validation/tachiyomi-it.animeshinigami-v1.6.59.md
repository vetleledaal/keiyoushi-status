# Extension Validation Report

- Extension: tachiyomi-it.animeshinigami-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8234656044798917709
- Source name: AnimeShinigami
- Source language: it
- Selected manga input: popular offset 0: Nano Machine (`.../106`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 11 | Nano Machine (`.../106`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | Nano Machine (`.../106`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nano Machine (`.../106`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nano Machine (`.../106`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 318 | Capitolo 01 (`.../capitolo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nano Machine, URL=`106` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.animeshinigami.com/.../5fa5edaa285e0b720c76d59a-106-350x476.jpg` (image/jpeg, 51568 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `106` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.animeshinigami.com/.../5fa5edaa285e0b720c76d59a-106-scaled.jpg` (image/jpeg, 687348 bytes, 1707x2560) |  |  |  |
| details author | PASS | Han-Joong-Wueol-Ya |  |  |  |
| details artist | PASS | Guem-Gang-Bul-Gae |  |  |  |
| details genres | PASS | Arti Marziali, Avventura, Azione, Fantasy, Sci-fi, Shounen, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Dopo essere stato disprezzato e aver messo in pericolo la sua vita, un orfano del culto demoniaco, Cheon Yeo-Woon, ha una visita inaspettata dal suo discendente dal futuro che inserisce una macchina nano nel corpo di Cheon Yeo-Woon, che cambia drasticamente la vita di Cheon Yeo-Woon dopo la sua attivazione. La storia del viaggio di Cheon Yeo-Woon di bypassare il culto demoniaco e diventare il miglior artista marziale è appena iniziata.<br><br>Alternative Names: Nano Mashin, نانو ماشین, นาโนมาชิน, ナノ魔神, 喇勞 魔神, 喇勞魔神, 奈米魔神, 某天成为魔神, 나노마신 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 318 chapters |  |  |  |
| chapter dates | LINT | All 318 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=318 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.animeshinigami.com/.../1.jpg` (image/jpeg, 372918 bytes, 650x931) |  |  |  |
