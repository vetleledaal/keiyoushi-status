# Extension Validation Report

- Extension: tachiyomi-zh.jiuermanhua-v1.4.15
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: sinmh
- Source ID: 1520913911854846698
- Source name: 92漫画
- Source language: zh
- Selected manga input: latest offset 0: 夏日颂歌 (`.../7582`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | 暴夜 (`.../1212`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 36 | 公司内请保持肃静 (`.../1257`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 36 | 夏日颂歌 (`.../7582`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | 我才不想当女孩子！ (`.../7313`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 夏日颂歌 (`.../7582`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 夏日颂歌 (`.../7582`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 33 | 第1话 (`.../317585.html`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 47 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=夏日颂歌, URL=`.../7582` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://cover.alltucdn.cc/.../1785252748sq1ZbVaB3ceu-t0W.jpg` (image/jpeg, 69366 bytes, 328x422) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7582` |  |  |  |
| details thumbnail URL | PASS | `http://cover.alltucdn.cc/.../1785252748sq1ZbVaB3ceu-t0W.jpg` |  |  |  |
| details author | PASS | CHT 소라 박영 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年漫画, #TL |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 在工作与爱情都失败后，桃璟回到了故乡无永，并在妈妈经营的小超市里，意外与一名帅气的男子相遇。 “要帮你签名吗？”深邃的眼眸、漆黑却清澈的瞳孔，这个人就是演员都准。 “在想要的更多之前，留下点既火热又特别的回忆吧。” 无法摆脱十年既疲惫又孤单的恋爱的桃璟不敢相信，眼前这段宛如仲夏夜之梦般，已经注定结局的时光。 “我正把整个夏天都倾注在你身上。以后提到夏天，我就会想起你。” “……偶尔会想起吧。” 一个想将短暂的季节仅作 >>展开 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | LINT | 32 of 33 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=32 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cover.alltucdn.cc/.../1785264130NWgzj6ExgJrgcNjx.jpg` (image/jpeg, 844798 bytes, 1280x5120) |  |  |  |
