# Extension Validation Report

- Extension: tachiyomi-ja.herosweb-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6981500022236807277
- Source name: HERO'S Web
- Source language: ja
- Selected manga input: popular offset 0: ローゼンガーテン・サーガ (`.../67ddd4d883f4f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | ローゼンガーテン・サーガ (`.../67ddd4d883f4f`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 6 | 元最強勇者の再就職 (`.../946edf2bc4813`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ローゼンガーテン・サーガ (`.../67ddd4d883f4f`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ローゼンガーテン・サーガ (`.../67ddd4d883f4f`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 132 | Episode１「勃発 〜Umwandlung〜」 (`.../6f2860cfbf638`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 58 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ローゼンガーテン・サーガ, URL=`.../67ddd4d883f4f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260508160144862B3A57E34AB76CAE603BCE7B1E509BC52-lg.webp` (image/webp (encoding: lossy), 29604 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../67ddd4d883f4f` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260508160144862B3A57E34AB76CAE603BCE7B1E509BC52.png` (image/png, 2727596 bytes, 2560x1344) |  |  |  |
| details author | PASS | 富士防人, 外岡馬骨 |  |  |  |
| details artist | PASS | 富士防人, 外岡馬骨 |  |  |  |
| details genres | PASS | SF・ファンタジー, バトル・アクション, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | リンは故郷の村が野盗に襲われたけど、特に落ち込んだりはしなかった！<br>稀代の変態…じゃなくて英雄・ジークフリートが宿る剣を拾った彼女は彼と共に旅に出るが、それは新たな変た…ではなく英雄達との戦いの始まりだった！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 132 chapters |  |  |  |
| chapter dates | PASS | 132 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comicsviewer.heros-web.com/.../master-1777539028943-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 14, 11, 0, 5, 10, 8, 9, 7, 2, 13, 12, 6, 4, 15, 1\]` (image/jpeg, 162272 bytes, 844x1200) |  |  |  |
