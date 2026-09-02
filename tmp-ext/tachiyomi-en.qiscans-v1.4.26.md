# Extension Validation Report

- Extension: tachiyomi-en.qiscans-v1.4.26
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5806040666300479660
- Source name: QiScans
- Source language: en
- Selected manga input: popular offset 0: Evolution From a Tree (`.../4190634673-cong-da-shu-kaishi-de-jinhuatrashed`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Evolution From a Tree (`.../4190634673-cong-da-shu-kaishi-de-jinhuatrashed`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | The End Has Come (`.../the-end-has-come`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Eight Empresses Betrayed Me, Only to Deeply Regret It After Being Reborn (`.../the-eight-empresses-betrayed-me-only-to-deeply-regret-it-after-being-reborn`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Return of the First Generation: The Strongest in History Reincarnates as His Descendant 1000 Years Later (`<redacted URL #1: selected resource; absolute; invalid web scheme>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Evolution From a Tree (`.../4190634673-cong-da-shu-kaishi-de-jinhuatrashed`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Evolution From a Tree (`.../4190634673-cong-da-shu-kaishi-de-jinhuatrashed`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 539 | Chapter 1 - Evolution From a Tree 1 (`.../8781815493-evolution-from-a-tree-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Evolution From a Tree, URL=`4190634673-cong-da-shu-kaishi-de-jinhuatrashed` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.qimanhwa.com/.../79151139-556b-4927-a85e-079ddb4aa398.webp` (image/webp (encoding: lossy), 791124 bytes, 1620x2148) |  |  |  |
| details identity | PASS | Details preserved selected URL `4190634673-cong-da-shu-kaishi-de-jinhuatrashed` |  |  |  |
| details thumbnail URL | PASS | `https://media.qimanhwa.com/.../79151139-556b-4927-a85e-079ddb4aa398.webp` |  |  |  |
| details author | PASS | 绯红之夜 |  |  |  |
| details artist | PASS | 黑鸟社 |  |  |  |
| details genres | PASS | Drama, Supernatural, Action, Adventure, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reborn as a willow tree!? Resurrection of spiritual energy, rise of all things. The reborn willow is also embarking on the path of evolution. It can evolve infinitely, is it “a divine power” or “a curse”?<br><br>Alternative Titles: Evolution From the Big Tree • Evolution Begins With a Big Tree • Mi evolución a partir de un árbol gigante • Starting Over as a Tree • 進化する者たち • Cóng Dà Shù Kāishǐ De Jìnhuà • 从大树开始的进化 • Começando a Evolução com uma Grande Árvore • Từ Đại Thụ Tiến Hóa • Моё перерождение в древо: Начало эволюции • Chuyển Sinh Thành Liễu Đột Biến • Cong Da Shu Kaishi De Jinhua • Evolution From a Tree • Evolution From a Tree • Cong Da Shu Kaishi De Jinhua • Mi evolución a partir de un árbol gigante • Starting Over as a Tree • Shinka suru Monotachi • Mi Evolución a Partir de un Árbol Gigante |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 208 name, chapter 209 name, chapter 235 name, chapter 251 name |  |  |  |
| chapters | PASS | 539 chapters |  |  |  |
| chapter dates | PASS | 539 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.qimanhwa.com/.../page_001.webp` (image/webp (container: extended), 89870 bytes, 800x450) |  |  |  |
