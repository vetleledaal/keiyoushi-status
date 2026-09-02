# Extension Validation Report

- Extension: tachiyomi-pt.animexnovel-v1.6.19
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 2
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3639622845750368999
- Source name: AnimeXNovel
- Source language: pt-BR
- Selected manga input: popular offset 0: As 100 Maldições da Casa Illeston (`.../as-100-maldicoes-da-casa-illeston`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | As 100 Maldições da Casa Illeston (`.../as-100-maldicoes-da-casa-illeston`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 5 | Okiraku Ryoushu no Tanoshii Ryouchi Bouei ~Seisan-kei Majutsu de Na mo na Kimura wo Saikyou no Jousai Toshi ni~ (`.../okiraku-ryoushu-no-tanoshii-ryouchi-bouei-seisan-kei-majutsu-de-na-mo-na-kimura-wo-saikyou-no-jousai-toshi-ni`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 8 | Mushoku Tensei: Isekai Ittara Honki Dasu (`.../mushoku-tensei-isekai-ittara-honki-dasu`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | As 100 Maldições da Casa Illeston (`.../as-100-maldicoes-da-casa-illeston`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The 100 Curses of House Illeston (`.../as-100-maldicoes-da-casa-illeston`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Capítulo 1 (`.../26374`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=As 100 Maldições da Casa Illeston, URL=`.../as-100-maldicoes-da-casa-illeston` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.animexnovel.com/.../Manhwa-As-100-Maldicoes-da-Casa-Illeston-Animexnovel-RubyScan-Cover-160x255-1.webp` (image/webp (encoding: lossy), 8420 bytes, 160x219) |  |  |  |
| details identity | UNUSUAL | Details changed selected title As 100 Maldições da Casa Illeston to The 100 Curses of House Illeston |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Tinta |  |  |  |
| details artist | PASS | Seolbum Kim |  |  |  |
| details genres | PASS | Drama, Fantasy, Romance, Mystery, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Reencarnei-me num webtoon de fantasia genérico… Acabei como a Necromante que será sacrificada pelo protagonista. Já que assim é, vou proteger minha vida e viver confortavelmente. Rumo à mansão cheia de maldições e fantasmas, a residência do vilão, o Arquiduque Illeston! ‘Vou quebrar a maldição desta mansão para você. Em troca, por favor, me cuide.’<br><br><br>Nomes Alternativos: The 100 Curses of Illeston Mansion, 일레스톤 저택의 100가지 저주<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | LINT | All 25 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=25 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.animexnovel.com/.../Manhwa-As-100-Maldicoes-da-Casa-Illeston-Animexnovel-RubyScan-Ch-1-Page-01.webp` (image/webp (encoding: lossy), 156326 bytes, 747x1024) |  |  |  |
