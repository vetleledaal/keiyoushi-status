# Extension Validation Report

- Extension: tachiyomi-ja.sundaywebevery-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8083066303045184316
- Source name: Sunday Web Every
- Source language: ja
- Selected manga input: latest offset 0: ファム・ファタールを召し上がれ@comic (`.../12207421983566884816`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 283 | 初恋あるごりずむ (`.../12207421984125927743`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 9 | ファム・ファタールを召し上がれ@comic (`.../12207421983566884816`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ファム・ファタールを召し上がれ@comic (`.../12207421983566884816`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ファム・ファタールを召し上がれ@comic (`.../12207421983566884816`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | 第1話 (`.../12207421983566884816`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 283 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ファム・ファタールを召し上がれ@comic, URL=`.../12207421983566884816` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 293/293 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 293/293 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.www.sunday-webry.com%2Fpublic%2Fseries-sub-thumbnail-vertical-with-logo%2F12207421983566841699-592a1c5e7576753e3440ce46bce9e810%3F1775201899` (image/jpeg, 84509 bytes, 504x354) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421983566884816` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.www.sunday-webry.com%2Fpublic%2Fseries-thumbnail%2F12207421983566841699-ad62f67a36ec9023cd58be02ba461611%3F1775201884` (image/jpeg, 62304 bytes, 484x281) |  |  |  |
| details author | PASS | 蒼井ひな太.../%E3%81%B2%E3%82%87%E3%81%93%E3%82%8D%E3%83%BC |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ニカ・サタニック・バルフェスタは悪女である。類い稀なる美貌と、自らに惚れた相手を意のままに操る『魅了』の異能で、世界中の人間を下僕に変えてきた。 そんなニカの次なる標的は、かつて宿敵だった魔界の魔王ナサニエル・ノア。しかしナサニエルは、ちょっと興奮するだけで気絶する超絶コミュ障だった。「魔王様……わたくしを、見て」ニカはあらゆる色仕掛けを駆使して、ナサニエルを虜にしようとするが… 惚れたら破滅のラブゲーム開幕！ ◆作者コメント 様々な手段で魅了してくる悪女ニカ、その猛攻にナサニエルくんと一緒に翻弄されちゃって下さい！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421983581769570-2c4e4428f10a4f535ce42975239d5202` (image/jpeg, 943877 bytes, 1445x2048) |  |  |  |
