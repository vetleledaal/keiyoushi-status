# Extension Validation Report

- Extension: tachiyomi-ja.amebamanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2623577517578458051
- Source name: Ameba Manga
- Source language: ja
- Selected manga input: popular offset 0: 地味で目立たない私は、今日で終わりにします。 (`.../163032`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 地味で目立たない私は、今日で終わりにします。 (`.../163032`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 断罪されている悪役令嬢と入れ替わって婚約者たちをぶっ飛ばしたら、溺愛が待っていました（コミック） (`.../713727`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 隣の席の、五十嵐くん。 (`.../144526`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | リアルコミック・ファンタジー～秀才・夏目利久の出版社改革【タテヨミ】 (`.../837210`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | 地味で目立たない私は、今日で終わりにします。 (`.../163032`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 地味で目立たない私は、今日で終わりにします。 (`.../163032`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | 🔒 地味で目立たない私は、今日で終わりにします。　1 (`.../963043`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=地味で目立たない私は、今日で終わりにします。, URL=`163032` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 205/205 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 205/205 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stat.dokusho-ojikan.jp/.../10f825d5-073a-4863-abe7-be4ca70a3e8a.jpg` (image/jpeg, 1288419 bytes, 1800x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `163032` |  |  |  |
| details thumbnail URL | PASS | `https://stat.dokusho-ojikan.jp/.../10f825d5-073a-4863-abe7-be4ca70a3e8a.jpg` |  |  |  |
| details author | PASS | 住吉文子, 大森蜜柑, れいた |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界, 異世界・ファンタジー, コミカライズ化, 純愛, 逆ハーレム, ファンタジー, 転生, 上司・部下, 異世界, 主人公が愛される, シェフとの恋愛, クール男子 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 公爵令嬢エレイン・ラナ・ノリスは、<br>聖女を苛めたという無実の罪を着せられ、婚約破棄されてしまった。<br>さながら悪役令嬢に仕立てられたラナは、実家からも追い出されてしまう。<br>しかし――ラナは異世界からの転生者だった。<br><br>「これからは自由に生きるわ！」<br><br>前世のコスプレ趣味を活かし、「地味」だと揶揄された見た目も大変身！<br>下町の宿屋の女将として第二の人生をスタート！<br>この国では珍しい「オニギリ」は評判だし、<br>宿屋では新しく仲間もでき、出だしは上々♪<br>そんなある日、ラナを裏切った幼馴染の騎士が宿を訪れて――！？<br><br>Publisher: KADOKAWA |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 500 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
