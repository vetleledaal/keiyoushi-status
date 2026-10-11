# Extension Validation Report

- Extension: tachiyomi-en.manganow-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangareader
- Source ID: 855054225815309342
- Source name: MangaNow
- Source language: en
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | BLACK CLOVER (`.../black-clover`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Hiding Out in an Apocalypse (`.../hiding-out-in-an-apocalypse`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Mightiest Melee Magician (`.../mightiest-melee-magician`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3718 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`.../martial-peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../f9aa4c83ffa6eb79_1704793734.jpg <redacted query values: w and resize>` (image/jpeg, 39005 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-peak` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../f9aa4c83ffa6eb79_1704793734.jpg <redacted query values: w and resize>` |  |  |  |
| details author | PASS | Momo (II) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Martial Arts, Fantasy, Historical, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A brief description of the manhua Martial Peak: The path to the heights of martial arts is a long and lonely test. In the face of adversity, you must remain strong and resilient. Only then can you overcome all obstacles and become truly strong. Heavenly Tower teaches its students in the most rigorous way how they could survive in the world of martial arts. Here the law of the jungle rules and takes into account not quantity, but quality. One genius outshines hundreds of mediocre ones. Our main character is Yang Kai, a student of the Heavenly Tower. However, he does not intend to submit to his fate, because he considers – through work and diligence – the way to the top of the martial arts!<br><br>Alternative Title: MP, 武炼巅峰 / Wǔ Liàn Diān Fēng |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3718 chapters |  |  |  |
| chapter dates | LINT | All 3718 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3718 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.mangaread.org/.../3.jpeg` (image/jpeg, 156964 bytes, 663x373) |  |  |  |
