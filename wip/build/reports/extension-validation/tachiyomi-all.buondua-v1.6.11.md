# Extension Validation Report

- Extension: tachiyomi-all.buondua-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1435103006121310663
- Source name: Buon Dua
- Source language: all
- Selected manga input: latest offset 0: Yeha (예하): Black Bunny (158 photos) (`.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [X.O] Seul (슬이): Vol.04 Exposure Diary (76 photos) (`.../x-o-seul-seul-i-vol-04-exposure-diary-76-photos-cc882a3a954d8338606f55db837e5d4a-56856`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | [AI Enhanced] [Fantasy] JISAM: Vol.09 Private Villa (108 photos) (`.../ai-enhanced-fantasy-jisam-vol-09-private-villa-108-photos-8d1cfd2c6e32b56e53f9f39902e540c3-56890`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Yeha (예하): Black Bunny (158 photos) (`.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Coser@chuchu: #012 リゼ エミ◯ア 夜はこれからよ (95 photos) (`.../coser-chuchu-012-rize-emi-a-yehakorekarayo-95-photos-0a8def49379d5ec481cca3487ea75340-56956`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yeha (예하): Black Bunny (158 photos) (`.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yeha (예하): Black Bunny (158 photos) (`.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Page 1 (`.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936 <redacted query values: page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yeha (예하): Black Bunny (158 photos), URL=`.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.buondua.com/.../Yeha-Your-Majesty-Black-Bunny-MissKON.com-012.jpeg <redacted query values: 800f88b1316d3d21379b95782919d316>` (image/jpeg, 103185 bytes, 1024x1535) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yeha-yeha-black-bunny-158-photos-5d1c46732f4869197e9aae4d1f0bc888-56936` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yeha |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | \[👉 Download link: MediaFire\](https://ouo.io/.../8e8499X)<br>\[👉 Download link: Terabox\](https://ouo.io/.../iFfM4P)<br><br><redacted credential header: password> |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.buondua.com/.../Yeha-Your-Majesty-Black-Bunny-MissKON.com-001.jpeg <redacted query values: 800f88b1316d3d21379b95782919d316>` (image/jpeg, 184437 bytes, 2303x1536) |  |  |  |
