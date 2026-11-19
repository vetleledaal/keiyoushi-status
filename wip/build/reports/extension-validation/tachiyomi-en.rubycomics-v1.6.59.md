# Extension Validation Report

- Extension: tachiyomi-en.rubycomics-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6792243715659475719
- Source name: Ruby Comics
- Source language: en
- Selected manga input: popular offset 0: Love by Mistake (`.../3247`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Love by Mistake (`.../3247`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | It’s My Childhood Friend’s Boyfriend, But… (`.../3373`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Romantic love (`.../3557`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Work Until Bedtime (`.../4831`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Love by Mistake (`.../3247`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Love by Mistake (`.../3247`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 141 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Love by Mistake, URL=`3247` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rubycomics.net/.../54.jpg` (image/jpeg, 84692 bytes, 735x948) |  |  |  |
| details identity | PASS | Details preserved selected URL `3247` |  |  |  |
| details thumbnail URL | PASS | `https://rubycomics.net/.../54.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Rating:** 4.5<br><br>The young, wealthy, and beautiful reporter, Zheng Shuyi, got dumped by a scumbag?! How could she leave him and the white lotus to live a peaceful and happy life? When she saw the Rolls-Royce owned by the white lotus’s rich CEO uncle, Zheng Shuyi crafted a plan, embarking on a comical journey to seduce him! If her scumbag of an ex wanted to slack off for the next twenty years, then she would become his and the white lotus’s auntie! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 141 chapters |  |  |  |
| chapter dates | PASS | 141 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rubycomics.net/.../00.jpg` (image/jpeg, 108399 bytes, 690x1001) |  |  |  |
