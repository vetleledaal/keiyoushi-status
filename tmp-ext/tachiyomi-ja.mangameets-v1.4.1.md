# Extension Validation Report

- Extension: tachiyomi-ja.mangameets-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2561264003659474410
- Source name: MangaMeets
- Source language: ja
- Selected manga input: popular offset 0: 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 牛柄ビキニを着せたかったBL (`.../9ec90fa0-d254-4a3c-b1f4-2a65c5462d32`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 海と遠泳 (`.../3ca7869a-8f48-4dc1-8c12-8b18af8fff14`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 19 | 応援団長メヤゾン (`.../cf0c1858-30b2-4d9c-9822-5473e6328457`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | Chapter 1 - 独占欲が強すぎる幼なじみ😠 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=恋の1コマ (恋コマ), URL=`c41e152b-f770-4b49-860b-fd5e59ce193f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://res.cloudinary.com/.../jch71qcxu1ftwcrs7kzg.png` (image/png, 1157729 bytes, 1400x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `c41e152b-f770-4b49-860b-fd5e59ce193f` |  |  |  |
| details thumbnail URL | PASS | `http://res.cloudinary.com/.../jch71qcxu1ftwcrs7kzg.png` |  |  |  |
| details author | PASS | ぽんちゃん亭 |  |  |  |
| details artist | PASS | ぽんちゃん亭 |  |  |  |
| details genres | PASS | 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | キュンとする〝恋の1コマ〟を短編で投稿します！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | LINT | All 17 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=17 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://res.cloudinary.com/.../pdywknk1tqug7esyrusg.png` (image/jpeg, 181835 bytes, 1080x1440) |  |  |  |
