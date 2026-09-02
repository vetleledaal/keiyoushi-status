# Extension Validation Report

- Extension: tachiyomi-en.divascans-v1.6.27
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3513996752712952755
- Source name: Diva Scans
- Source language: en
- Selected manga input: popular offset 0: Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | When Night Falls on Chugang (`.../cmpqv7fr200f8p1qknllhek4h`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Freelancer (`.../cms8368fjf1cb5fqkgrn2l88x`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Grand Duchess Disappeared on a Silent Night (`.../cms9kqqjb33xidbqk9wvnqmqz`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 1 (`.../cmpr7bfel00kvz5qkucutzn4v`) |  | <1s |
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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Obedient Pregnancy, URL=`cmpr7aefu00d1wdqkdzdcymq3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://divascans.org/.../cover-1f0d98f3ea63c8398f841ed8a3e5e774.webp` (image/webp (encoding: lossy), 435814 bytes, 1280x1706) |  |  |  |
| details identity | PASS | Details preserved selected URL `cmpr7aefu00d1wdqkdzdcymq3` |  |  |  |
| details thumbnail URL | PASS | `https://divascans.org/.../cover-1f0d98f3ea63c8398f841ed8a3e5e774.webp` |  |  |  |
| details author | PASS | Diva |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Adult, Drama, Mature, Psychological, Romance, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rating: 9.8<br>Type: MANHWA<br>Origin: KOREAN |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.divascans.org/.../001.webp` (image/webp (encoding: lossy), 738340 bytes, 720x13184) |  |  |  |
