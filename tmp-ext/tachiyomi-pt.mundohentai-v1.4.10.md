# Extension Validation Report

- Extension: tachiyomi-pt.mundohentai-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 141171756957474060
- Source name: Mundo Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: [Doujinshi] A História da Gata Que Resgatei Que Era Uma Gyaru e Filha de Um Yakuza (`.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | [Doujinshi] A História da Gata Que Resgatei Que Era Uma Gyaru e Filha de Um Yakuza (`.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | [Doujinshi] A Gyaru Marrenta Que Não Resiste a um Pau Grande e o Otaku Dotado (`.../a-gyaru-marrenta-que-nao-resiste-a-um-pau-grande-e-o-otaku-dotado`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | [Doujinshi] A História da Gata Que Resgatei Que Era Uma Gyaru e Filha de Um Yakuza (`.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | [Doujinshi] A História da Gata Que Resgatei Que Era Uma Gyaru e Filha de Um Yakuza (`.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo (`.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Doujinshi\] A História da Gata Que Resgatei Que Era Uma Gyaru e Filha de Um Yakuza, URL=`.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mundohentaioficial.com/.../001-241x334.jpg` (image/jpeg, 22691 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-historia-da-gata-que-resgatei-que-era-uma-gyaru-e-filha-de-um-yakuza` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mundohentaioficial.com/.../001.jpg` (image/jpeg, 286155 bytes, 1290x1821) |  |  |  |
| details author | PASS | Login Registre-se |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Creampie, Dark Skin, Gyaru, Masturbação, Peitões, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cor: Preto e Branco |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mundohentaioficial.com/.../001.jpg` (image/jpeg, 286155 bytes, 1290x1821) |  |  |  |
