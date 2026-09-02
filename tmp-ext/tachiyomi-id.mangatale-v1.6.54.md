# Extension Validation Report

- Extension: tachiyomi-id.mangatale-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1532456597012176985
- Source name: Ikiru
- Source language: id
- Selected manga input: popular offset 0: The Man (`.../%7B%22id%22:185031,%22slug%22:%22the-man%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | The Man (`.../%7B%22id%22:185031,%22slug%22:%22the-man%22%7D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Hello? Veterinarian! (`.../%7B%22id%22:550624,%22slug%22:%22hello-veterinarian%22%7D`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Monster Jenius dari Keluarga Konglomerat (`.../%7B%22id%22:863533,%22slug%22:%22monster-jenius-dari-keluarga-konglomerat%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Hiiragi-san Chi no Kyuuketsu Jijou (`.../%7B%22id%22:66148,%22slug%22:%22hiiragi-san-chi-no-kyuuketsu-jijou%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | The Man (`.../%7B%22id%22:185031,%22slug%22:%22the-man%22%7D`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Man (`.../%7B%22id%22:185031,%22slug%22:%22the-man%22%7D`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 277 | Chapter 1 (`.../chapter-1.294116`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 116 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Man, URL=`{"id":185031,"slug":"the-man"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 114/114 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 114/114 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://07.ikiru.wtf/.../the-man-cover-550550-ZRf2Onzh.png` (image/png, 2276291 bytes, 1440x2074) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":185031,"slug":"the-man"}` |  |  |  |
| details thumbnail URL | PASS | `https://07.ikiru.wtf/.../the-man-cover-550550-ZRf2Onzh.png` |  |  |  |
| details author | PASS | HA Neulso, KIM Tae-gung |  |  |  |
| details artist | PASS | Dogado |  |  |  |
| details genres | PASS | Drama, Seinen, Slice of Life, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Han Yoo-hyun, pekerja kantoran terbaik di dunia! Setelah kehilangan segalanya, ia kembali ke masa lalu dan mengulang kehidupannya lagi. Kali ini, tidak akan ada penyesalan lagi!<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 277 chapters |  |  |  |
| chapter dates | PASS | 277 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 116 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://v2.yuucdn.net/.../Kpp8K3dKwFoI4g5YyaPxioJI3iyz1G.jpg` (image/jpeg, 11973 bytes, 700x1240) |  |  |  |
