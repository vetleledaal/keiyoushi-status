# Extension Validation Report

- Extension: tachiyomi-ar.stellarsaber-v1.6.35
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2142158598125421915
- Source name: StellarSaber
- Source language: ar
- Selected manga input: popular offset 0: Fate/Prototype: Sougin no Fragments (`.../fate-prototype-sougin-no-fragments`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Fate/Prototype: Sougin no Fragments (`.../fate-prototype-sougin-no-fragments`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Burn the Witch (`.../burn-the-witch`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Mahoutsukai no Yoru (`.../mahoutsukai-no-yoru`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Oresama Teacher (`.../oresama-teacher`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Fate/Prototype: Sougin no Fragments (`.../fate-prototype-sougin-no-fragments`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fate/Prototype: Sougin no Fragments (`.../fate-prototype-sougin-no-fragments`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | الفصل 01 (`.../fate-prototype-sougin-no-fragments-%D8%A7%D9%84%D9%81%D8%B5%D9%84-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fate/Prototype: Sougin no Fragments, URL=`.../fate-prototype-sougin-no-fragments` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Burn the Witch, URL=`.../burn-the-witch` at page 1 offset 21 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-stellarsaber.com/.../219-87fae60d394132ec.jpg` (image/jpeg, 191317 bytes, 721x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fate-prototype-sougin-no-fragments` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-stellarsaber.com/.../219-87fae60d394132ec.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أكشن, خارق للطبيعة, سينين, شريحة من الحياة, مأساة, مغامرة, Stellar Saber |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | تستيقظ الشابة أياكا ساجيو على إفطار صباحي عادي مع والدها وأختها الكبرى ماناكا، غير مدركين أن معركة ذات أبعاد مخيفة قد بدأت الآن في طوكيو. هذه المعركة هي حرب الكأس… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-stellarsaber.com/.../2cef2a044b84634b022b56ae7cfe2299df419046.bin` (image/webp (encoding: lossy), 669546 bytes, 3024x4300; server Content-Type: application/octet-stream) |  |  |  |
