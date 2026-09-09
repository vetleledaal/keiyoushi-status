# Extension Validation Report

- Extension: tachiyomi-en.mangakakalotfun-v1.6.36
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: mangahub
- Source ID: 6491120161556233904
- Source name: Mangakakalot.fun
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Sweet Guy (`.../sweet-guy_120`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | The Outcast Is Too Good At Martial Arts (`.../the-outcast-is-too-good-at-martial-arts`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Diamond No Kouzai (`.../diamond-no-kouzai`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3865 | Chapter 1 (`.../chapter-1.0`) |  | <1s |
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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`.../martial-peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` -> 2 manga URLs (examples: `.../tales-of-demons-and-gods`, `.../tales-of-demons-and-gods-by-mad-snail`) |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../martial-peak.jpg` (image/jpeg, 43584 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-peak` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../martial-peak.jpg` |  |  |  |
| details author | PASS | Momo (莫默); Pikapi (噼咔噼) |  |  |  |
| details artist | PASS | Pikapi (噼咔噼) |  |  |  |
| details genres | PASS | Action, Adventure, Wuxia, Fantasy, Martial Arts, Harem, Supernatural, Sexual Violence, Long Strip, Adaptation, Full Color, Suggestive |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The peak of martial arts is solitary and lonely. It is an endless pursuit for unattainable heights as well. In order to surpass the limits of martial arts, growth and the will to survive in adverse situations is necessary.<br>One day, Yang Kai, a disciple-on-trial (and floor sweeper) of the Lingxiao Martial Arts Sect discovered a Wordless Black Book. That marked the turn in his luck and the beginning of his martial arts journey.<br><br>Alternative Names:<br>- MP, 武炼巅峰 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3865 chapters |  |  |  |
| chapter dates | PASS | 3865 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 258060 bytes, 764x1200) |  |  |  |
