# Extension Validation Report

- Extension: tachiyomi-all.asmhentai-v1.6.15
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
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 6135783261825346877
- Source name: AsmHentai
- Source language: en
- Selected manga input: latest offset 0: [CLEF] PAVOLIA REINE - SUN PARTY (`.../697631`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Takatsu] Ou-sama Appli - King App [English] (`.../165159`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | [Takatsu] Hitozuma A-san to Musuko no Yuujin N-kun - Married wife A and son's friend N-kun [English] (`.../224682`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | [CLEF] PAVOLIA REINE - SUN PARTY (`.../697631`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Ohara Makoto] InCha na Ore ga Madougu o Tsukatte Share House de Harem o Tsukutte Mita. 1+2 [English MTL] [Decensored] [Digital] (`.../697577`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [CLEF] PAVOLIA REINE - SUN PARTY (`.../697631`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [CLEF] PAVOLIA REINE - SUN PARTY (`.../697631`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../697631`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[CLEF\] PAVOLIA REINE - SUN PARTY, URL=`.../697631` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.asmhentai.com/.../thumb.jpg` (image/jpeg, 19818 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../697631` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://images.asmhentai.com/.../cover.jpg` (image/jpeg, 33670 bytes, 350x489) |  |  |  |
| details author | PASS | clef |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | bbm, big breasts, blowjob, bondage, mmf threesome, sole female, vtuber |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: hololive<br><br>**Characters**: pavolia reine<br><br>**Languages**: english<br><br>**Category**: doujinshi<br><br>**Pages**: 27 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.asmhentai.com/.../1.jpg` (image/jpeg, 506451 bytes, 1280x1790) |  |  |  |
