# Extension Validation Report

- Extension: tachiyomi-en.mangamaniacs-v1.6.54
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5502656519292762717
- Source name: MangaManiacs
- Source language: en
- Selected manga input: popular offset 0: A Man of Virtue (`.../2056`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Man of Virtue (`.../2056`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Dangerous Convenience Store (`.../188`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Rogue Prince Is Secretly an Omega (`.../6791`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Black Beast Falls in Love (`.../4489`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Man of Virtue (`.../2056`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Man of Virtue (`.../2056`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Man of Virtue, URL=`2056` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangamaniacs.org/.../A-Man-of-Virtue.jpg` (image/jpeg, 15852 bytes, 156x208) |  |  |  |
| details identity | PASS | Details preserved selected URL `2056` |  |  |  |
| details thumbnail URL | PASS | `https://mangamaniacs.org/.../A-Man-of-Virtue.jpg` |  |  |  |
| details author | PASS | GGANG-E |  |  |  |
| details artist | PASS | Wook |  |  |  |
| details genres | PASS | Adult, Comedy, Manhwa, Romance, Slice of Life, Smut, Supernatural, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | What’s it like spending your whole life coming in second place? Ask Nam Jinwoo: he’s been living in the shadow of his rival, Ma Sangtae, his whole life. Now the two are even working in the same office. But passion is strange is a strange beast… It can start as envy or hate and turn into something, well, erotic. Before he knows it, Jinwoo’s head is filled with the most vivid, dirty, and erotic fantasies featuring none other than Sangtae. Unable to control the fantasies, the only way to stop them might be the last thing he wants to do…<br><br>Alternative Names: Um Homem de Virtude / Un Hombre De Virtud / Сама добродетель / 如幻初醒 / 幸福企划案 / 正直的变态 / 沉默男子 / 静かな男 / 정숙한 남자 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | LINT | 9 of 61 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.mangamaniacs.org/.../2021-09-24_14-55-13.951Z_00_866c89aece764db0169275ccae5ab0c7.jpeg` (image/jpeg, 219917 bytes, 720x4302) |  |  |  |
