# Extension Validation Report

- Extension: tachiyomi-ja.comicfesta-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8029218690220992872
- Source name: Comic Festa
- Source language: ja
- Selected manga input: popular offset 0: 私を嫌いだと言った幼なじみが記憶を失ったら、私に恋をしたようです（単話版） (`.../256772`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 私を嫌いだと言った幼なじみが記憶を失ったら、私に恋をしたようです（単話版） (`.../256772`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | ヤリ部屋暮らし【フルカラー】 (`.../171777`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 白い結婚‐王と王妃の恋ものがたり2‐（分冊版） (`.../260126`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 薔薇の歌姫は寡黙なディーラーの手で花開く (`.../260026`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 私を嫌いだと言った幼なじみが記憶を失ったら、私に恋をしたようです（単話版） (`.../256772`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 私を嫌いだと言った幼なじみが記憶を失ったら、私に恋をしたようです（単話版） (`.../256772`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 🔒 私を嫌いだと言った幼なじみが記憶を失ったら、私に恋をしたようです（単話版） (`.../download`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=私を嫌いだと言った幼なじみが記憶を失ったら、私に恋をしたようです（単話版）, URL=`256772` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comic-image.iowl.jp/.../V1274895_large.jpg` (image/jpeg, 100502 bytes, 253x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `256772` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://comic-image.iowl.jp/.../256772_large.jpg` (image/jpeg, 100502 bytes, 253x360) |  |  |  |
| details author | PASS | くまのみ鮭, クレイン |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, 独占配信, 広告出稿作品, ComicFesta激推し作品 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://comic.iowl.jp/.../monthly_general <redacted query values: page>` to `https://comic.iowl.jp/.../monthly_general <redacted query values: page and _rsc>` (1 redirects); popular: `https://comic.iowl.jp/.../monthly_general <redacted query values: page>` to `https://comic.iowl.jp/.../monthly_general <redacted query values: page and _rsc>` (1 redirects); popular: `https://comic.iowl.jp/.../download` to `https://comic.iowl.jp/.../entry <redacted query values: dst>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
