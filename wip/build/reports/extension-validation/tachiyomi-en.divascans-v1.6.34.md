# Extension Validation Report

- Extension: tachiyomi-en.divascans-v1.6.34
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: vinetheme
- Source ID: 3513996752712952755
- Source name: Diva Scans
- Source language: en
- Selected manga input: popular offset 0: Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Another Self (`.../cmprblop60000shqk4b7iv1y7`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Blemish (`.../cmuqofbpy0botlvqkvp4nrr30`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Dog of the Bunker (`.../cmw4sqzzc34wvu9qkjju9tu6k`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Obedient Pregnancy (`.../cmpr7aefu00d1wdqkdzdcymq3`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 47 | Chapter 1 (`.../cmpr7bfel00kvz5qkucutzn4v`) |  | <1s |
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
| details description | PASS | Rating: 9.7<br>Type: MANHWA<br>Origin: KOREAN<br><br>**Alternative titles:**<br>- 순종적 임신<br>- Conceived in Submission<br>- Embarazo obediente<br>- Fügsam in deiner Hand<br>- La embarazada sumisa<br>- Mang Thai Ngoan Ngoãn<br>- Ngoan Ngoãn Mang Thai Đi!<br>- Soumise par nature<br>- Submissive Pregnancy<br>- Sự Mang Thai Phục Tùng<br>- Послушная беременность<br>- รักครั้งนี้ต้องจำนน<br>- เกมรักควบคุมใจ<br>- 従順な妊娠<br>- 順從你的孕望<br>- 顺从怀孕 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://divascans.org/.../obedient-pregnancy <redacted query values: sort>` to `https://divascans.org/.../obedient-pregnancy <redacted query values: sort and _rsc>` (1 redirects); popular: `https://divascans.org/.../obedient-pregnancy <redacted query values: sort>` to `https://divascans.org/.../obedient-pregnancy <redacted query values: sort and _rsc>` (1 redirects); popular: `https://divascans.org/.../1` to `https://divascans.org/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://media.divascans.org/.../001.webp` (image/webp (encoding: lossy), 738340 bytes, 720x13184) |  |  |  |
