# Extension Validation Report

- Extension: tachiyomi-th.niceoppai-v1.6.30
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7720269837249664423
- Source name: Niceoppai
- Source language: th
- Selected manga input: popular offset 0: Naruto (`.../naruto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 44 | Naruto (`.../naruto`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 44 | Tenkuu Shinpan (`.../tenkuu_shinpan`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 44 | Tonari no Elf ga Darashinai! (`.../Tonari-no-Elf-ga-Darashinai`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 44 | Naughty Girl (`.../Naughty-Girl`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Naruto (`.../naruto`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Naruto (`.../naruto`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 44 entries |  |  |  |
| latest listing | PASS | 44 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Naruto, URL=`.../naruto` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 184/184 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 184/184 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.niceoppai.net/.../naruto.jpg` (image/jpeg, 67358 bytes, 248x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../naruto` |  |  |  |
| details thumbnail URL | PASS | `https://www.niceoppai.net/.../naruto.jpg` |  |  |  |
| details author | PASS | Masashi Kishimoto |  |  |  |
| details artist | PASS | Masashi Kishimoto |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Shounen, Manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | สิบสองปีที่แล้ว จิ้งจอกเก้าหางได้บุกดจมตีหมู่บ้านินจาโคโนฮางาคุเร จิ้งจอกชั่วร้ายได้พ่ายแพ้อย่างรวดเร็วและถูกผนึกไว้ในตัวอุซึมากิ นารูโตะ โดยท่านโฮคาเงะรุ่นที่สี่ ผู้ที่เสียสละชีวิตตัวเองเพื่อปกป้องหมู่บ้าน ตอนนี้ นารูโตะได้กลายเป็นนินจาทึ่มอันดับหนึ่งของหมู่บ้าน ที่ต้องการจะเป็นโฮคาเงะและได้รับการชื่นชมจากคนในหมู่บ้านซึ่งยังไม่ค่อยแน่ใจในตัวเขา |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
