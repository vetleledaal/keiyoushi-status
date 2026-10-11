# Extension Validation Report

- Extension: tachiyomi-all.pornpics-v1.6.0
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
- Source implementation: keiyoushi.source.a
- Source ID: 1459635082044256286
- Source name: PornPics
- Source language: en
- Selected manga input: popular offset 0: Solo girl with perky tits and a hairy muff removes her lingerie to pose nude (`.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Solo girl with perky tits and a hairy muff removes her lingerie to pose nude (`.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 19 | Flexible babe dakota shows her inviting pussy while working out all nude (`.../flexible-babe-dakota-shows-her-inviting-pussy-while-working-out-all-nude-49123978`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 19 | British babe shows her small breasts and her hairy pussy outdoors (`.../british-babe-shows-her-small-breasts-and-her-hairy-pussy-outdoors-85034023`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 19 | Spank monster nude gallery (`.../spank-monster-nude-gallery-66341794`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Solo girl with perky tits and a hairy muff removes her lingerie to pose nude 92717676 (`.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo girl with perky tits and a hairy muff removes her lingerie to pose nude (`.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo girl with perky tits and a hairy muff removes her lingerie to pose nude 92717676, URL=`.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdni.pornpics.com/.../92717676_001_bc32.jpg` (image/jpeg, 70543 bytes, 682x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-girl-with-perky-tits-and-a-hairy-muff-removes-her-lingerie-to-pose-nude-92717676` |  |  |  |
| details thumbnail URL | PASS | `https://cdni.pornpics.com/.../92717676_001_bc32.jpg` |  |  |  |
| details author | PASS | Anita Queen |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hungarian Honeys, MILF, Natural Tits, Close Up, European, Clothed, Czech, Undressing, Nipples, Pornstar, Hairy, Brunette MILF, MILF Lingerie, Czech MILF, Perfect Natural Tits, Small Tits MILF, MILF Solo, Brunette Babe, All Over 40 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Rating: 100%; Views: 197,949 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdni.pornpics.com/.../92717676_001_bc32.jpg` (image/jpeg, 70543 bytes, 682x1024) |  |  |  |
