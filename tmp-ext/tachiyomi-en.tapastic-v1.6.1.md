# Extension Validation Report

- Extension: tachiyomi-en.tapastic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5554748812413853237
- Source name: Tapas
- Source language: en
- Selected manga input: popular offset 0: The Mighty Maid Prefers Her Peace (`.../335353`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Mighty Maid Prefers Her Peace (`.../335353`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Revenge of the Baskerville Bloodhound (`.../264582`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 |  A Wholesome Love Story Turns Dark (`.../335164`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Giselle the Unbreakable (`.../314588`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | The Mighty Maid Prefers Her Peace (`.../335353`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Mighty Maid Prefers Her Peace (`.../335353`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Episode 1 (`.../3957476`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 75 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Mighty Maid Prefers Her Peace, URL=`.../335353` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://story-a.tapas.io/.../514fd1a3-428f-41bd-aa6c-516386ded5ff.png` (image/png, 582208 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../335353` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://us-a.tapas.io/.../514fd1a3-428f-41bd-aa6c-516386ded5ff_z.jpg` (image/jpeg, 182284 bytes, 400x600) |  |  |  |
| details author | PASS | chova, Matte, Park Oat |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I saved the world disguised as my brother, died a hero, and woke up flat broke. My plan for job security? Become a maid at a manor so toxic that workers don't last a week. You can’t get fired if no one wants the job! Too bad my new workplace features a mysterious viscount, a shady gardener, and daily assassination attempts. I used to slaughter entire armies, now I’m just trying to clock out alive. Can I get some damn peace, or did I just sign up to be a part of the empire's deadliest conspiracy?<br><br>The Mighty Maid Prefers Her Peace Original Title: 힘을 숨기고 즐기는 평화로운 하녀 생활 ⓒ CHOVA, MATTE, Park Oat / Yeondam Published by TAPAS ENTERTAINMENT 2026<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 75 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://tapas.io/.../info` to `https://tapas.io/.../info` (1 redirects) |  |  |  |
| page load | PASS | `https://us-a.tapas.io/.../8443fd94-9928-4470-bf70-f61b79400041-0.jpg <redacted query values: __token__ and version>` (image/jpeg, 115795 bytes, 940x1988) |  |  |  |
