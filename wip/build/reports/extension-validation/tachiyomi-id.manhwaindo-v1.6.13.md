# Extension Validation Report

- Extension: tachiyomi-id.manhwaindo-v1.6.13
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 9
- Lint: 0
- Warnings: 1
- Skipped: 26
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 862941840467210819
- Source name: Manhwa Indo
- Source language: id

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 |  (`.../eleceed`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 |  (`.../i-only-need-the-dukes-child`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | skipped | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | skipped | 0 |  |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | skipped | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | SKIP | No manga was returned by popular or latest |  |  |  |
| details operation | SKIP | No manga was returned by popular or latest |  |  |  |
| chapters operation | SKIP | No manga was returned by popular or latest |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | SKIP | No manga was returned by popular or latest |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 1: title=<blank>, URL=`.../eleceed`, popular entry 2: title=<blank>, URL=`.../revenge-of-the-iron-blooded-sword-hound`, popular entry 3: title=<blank>, URL=`.../killer-peter`, popular entry 4: title=<blank>, URL=`.../magic-emperor`, popular entry 5: title=<blank>, URL=`.../the-clans-failure-is-the-former-strongest-in-the-continent`, popular entry 6: title=<blank>, URL=`.../the-regressed-mercenarys-machinations`, popular entry 7: title=<blank>, URL=`.../overgeared`, popular entry 8: title=<blank>, URL=`.../became-the-patron-of-villains`, popular entry 9: title=<blank>, URL=`.../nano-machine`, popular entry 10: title=<blank>, URL=`.../mercenary-enrollment`, popular entry 11: title=<blank>, URL=`.../the-return-of-the-scorned-genius`, popular entry 12: title=<blank>, URL=`.../solo-max-level-newbie`, latest entry 1: title=<blank>, URL=`.../i-only-need-the-dukes-child`, latest entry 2: title=<blank>, URL=`.../how-to-live-as-the-vampire-lord-crimson-reset`, latest entry 3: title=<blank>, URL=`.../aisai-no-ura-aka`, latest entry 4: title=<blank>, URL=`.../lets-make-saving-a-habit`, latest entry 5: title=<blank>, URL=`.../the-third-generation-of-chaebols-that-dominate`, latest entry 6: title=<blank>, URL=`.../time-healer-ceres`, latest entry 7: title=<blank>, URL=`.../crimson-reset`, latest entry 8: title=<blank>, URL=`.../marriage-with-a-suspiciously-demure-husband`, latest entry 9: title=<blank>, URL=`.../i-became-the-contract-mother-of-the-grim-reaper-dukes-family-and-they-became-obsessed-with-me`, latest entry 10: title=<blank>, URL=`.../how-to-live-as-the-vampire-lord`, latest entry 11: title=<blank>, URL=`.../only-i-have-an-ex-grade-summon`, latest entry 12: title=<blank>, URL=`.../sss-class-suicide-hunter` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://imgx-id.gmbr.pro/.../thumbnail.jpg` (image/jpeg, 17210 bytes, 219x319) |  |  |  |
| details identity | SKIP | No selected manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://www.manhwaindo.my/.../1 <redacted query values: sort>` to `https://www.manhwaindo.my/.../series <redacted query values: sort>` (1 redirects); popular: `https://www.manhwaindo.my/.../1 <redacted query values: sort>` to `https://www.manhwaindo.my/.../series <redacted query values: sort>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
