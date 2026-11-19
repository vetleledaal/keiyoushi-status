# Extension Validation Report

- Extension: tachiyomi-zh.jiuermanhua-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: sinmh
- Source ID: 1520913911854846698
- Source name: 92漫画
- Source language: zh
- Selected manga input: popular offset 0: 暴夜 (`.../1212`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 暴夜 (`.../1212`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | 脾气和身体都很大的濑川先生要和我认真谈恋爱 (`.../944`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | 异世界后宫循环：为逃离重复的一日而纵享春宵 (`.../6156`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 神乐槌 (`.../201`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 暴夜 (`.../1212`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 暴夜 (`.../1212`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 96 | 第1话 (`.../66744.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=暴夜, URL=`.../1212` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://cover.alltucdn.cc/.../1709448633iFD25aeBo0vclZ3i.jpg` (image/jpeg, 71751 bytes, 328x422) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1212` |  |  |  |
| details thumbnail URL | PASS | `http://cover.alltucdn.cc/.../1709448633iFD25aeBo0vclZ3i.jpg` |  |  |  |
| details author | PASS | 佚名 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 冒险, 奇幻, 轻小说, 少年漫画, 日本 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | “我若无法拥有你，那就只能毁掉你。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | LINT | 95 of 96 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=95 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cover.alltucdn.cc/.../1709449000qIFymaLExrErcDu9.jpg` (image/jpeg, 953055 bytes, 800x7286) |  |  |  |
