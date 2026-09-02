# Extension Validation Report

- Extension: tachiyomi-pt.hentaiseason-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 28629678708276
- Source name: Hentai Season
- Source language: pt-BR
- Selected manga input: latest offset 0: Pack de Imagens (High School DxD / Rias) (`.../pack-de-imagens-high-school-dxd-rias`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Pack de Imagens (High School DxD / Rias) (`.../pack-de-imagens-high-school-dxd-rias`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Traição de uma garota com cabelo grisalho (`.../traicao-de-uma-garota-com-cabelo-grisalho`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Pack de Imagens (High School DxD / Rias) (`.../pack-de-imagens-high-school-dxd-rias`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Traição de uma garota com cabelo grisalho (`.../traicao-de-uma-garota-com-cabelo-grisalho`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Pack de Imagens (High School DxD / Rias) (`.../pack-de-imagens-high-school-dxd-rias`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Pack de Imagens (High School DxD / Rias) (`.../pack-de-imagens-high-school-dxd-rias`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../pack-de-imagens-high-school-dxd-rias`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pack de Imagens (High School DxD / Rias), URL=`.../pack-de-imagens-high-school-dxd-rias` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaiseason.com/.../pack_imagens_high_school_dxd_rias_17-241x334.jpg` (image/jpeg, 16374 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pack-de-imagens-high-school-dxd-rias` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiseason.com/.../pack_imagens_high_school_dxd_rias_17.jpg` (image/jpeg, 121072 bytes, 850x1275) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | lançamentos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Comissão de traduções? Você pode pedir uma aqui! Sugestão de packs? Participe do nosso discord clicando aqui! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaiseason.com/.../pack_imagens_high_school_dxd_rias_01.jpg` (image/jpeg, 250032 bytes, 850x1204) |  |  |  |
