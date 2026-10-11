# Extension Validation Report

- Extension: tachiyomi-all.kiutaku-v1.6.0
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
- Source ID: 3040035304874076216
- Source name: Kiutaku
- Source language: all
- Selected manga input: popular offset 0: Machi 馬吉 - The Herta Swimsuit - Mitaku (`.../7336`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Machi 馬吉 - The Herta Swimsuit - Mitaku (`.../7336`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Machi 馬吉 - Firefly Swimsuit (Honkai: Star Rail) - Mitaku (`.../7160`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Sayo Momo - Remielle Lingerie - Mitaku (`.../7354`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Remukira - Ayaka Maid - Mitaku (`.../7334`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Machi 馬吉 - The Herta Swimsuit - Mitaku (`.../7336`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Machi 馬吉 - The Herta Swimsuit - Mitaku (`.../7336`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Page 1 (`.../7336`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Machi 馬吉 - The Herta Swimsuit - Mitaku, URL=`.../7336` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mitaku.net/.../Machi-%E9%A6%AC%E5%90%89-The-Herta-Swimsuit-Cover.jpg` (image/jpeg, 272867 bytes, 800x356) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7336` |  |  |  |
| details thumbnail URL | PASS | `https://mitaku.net/.../Machi-%E9%A6%AC%E5%90%89-The-Herta-Swimsuit-Cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Honkai: Star Rail, Machi 馬吉, Herta |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mitaku.net/.../Machi-%E9%A6%AC%E5%90%89-The-Herta-Swimsuit-1.jpg` (image/jpeg, 251195 bytes, 768x1024) |  |  |  |
