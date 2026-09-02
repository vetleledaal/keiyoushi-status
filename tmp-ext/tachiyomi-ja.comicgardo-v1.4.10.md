# Extension Validation Report

- Extension: tachiyomi-ja.comicgardo-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 2
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3118962894631295374
- Source name: Comic Gardo
- Source language: ja
- Selected manga input: popular offset 0: 天下の大悪人に転生した少年、人たらしの大英雄になる　～傾国の美少女たちと英雄軍団を作ります～ (`.../12207421984035792819`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 135 | 天下の大悪人に転生した少年、人たらしの大英雄になる　～傾国の美少女たちと英雄軍団を作ります～ (`.../12207421984035792819`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 天下の大悪人に転生した少年、人たらしの大英雄になる　～傾国の美少女たちと英雄軍団を作ります～ (`.../12207421983834473688`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 天下の大悪人に転生した少年、人たらしの大英雄になる　～傾国の美少女たちと英雄軍団を作ります～ (`.../12207421984035792819`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 8 | 第1話「天下の大悪人、義妹を気遣う」 (`.../12207421983834473688`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 58 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 135 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=天下の大悪人に転生した少年、人たらしの大英雄になる　～傾国の美少女たちと英雄軍団を作ります～, URL=`.../12207421983834473688` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 136/136 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 136/136 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-gardo.com%2Fpublic%2Fseries-thumbnail%2F12207421983745849449-e473a07067eea4afafd7f79d0fd44038%3F1781169090` (image/jpeg, 76808 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984035792819` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-gardo.com%2Fpublic%2Fseries-thumbnail%2F12207421983745849449-e473a07067eea4afafd7f79d0fd44038%3F1781169090` (image/jpeg, 111553 bytes, 484x484) |  |  |  |
| details author | PASS | Okoze＋サイトウミチ.../%E3%82%82%E3%81%8D%E3%82%85 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 中華風RPGゲーム『剣主大乱史伝』の世界に転生したことに気付いた少年・黄天芳。彼は義妹・柳星怜が将来“傾国の悪女”となってしまうこと、そして自身が“天下の大悪人”として処刑される未来を思い出し、破滅回避のため動き出す！ その行動はいつしか原作展開に思わぬ影響を及ぼし、さらに“傾国級”の美女たちを続々と味方につけていき――!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.comic-gardo.com/.../12207421983834649374-88449e7a2c5bb5fcf5cb708c14c0778d` (image/jpeg, 401402 bytes, 1125x1600) |  |  |  |
